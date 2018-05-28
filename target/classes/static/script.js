angular.module('taskList', []);
angular.module('taskList').controller('taskListController', function ($scope, $http, $timeout) {
    $scope.tasks = [];


    $http({
        method: 'GET',
        url: '/task'
    }).then(response => {
        $scope.tasks = response.data;
    });

    $scope.addTask = function (task) {
        $http({
            method: 'POST',
            url: '/task',
            data: task
        }).then(response => {
            $scope.tasks.push(angular.copy(response.data));
        });
        delete $scope.task;
    }

    $scope.removeTask = function (rtask) {
        $http({
            method: 'DELETE',
            url: '/task/' + rtask.id
        }).then(() => {
            $scope.tasks = $scope.tasks.filter(function (task) {
                return task != rtask;
            });
        });
    }



    $scope.taskChanged = function (task) {
        $http({
            method: 'PATCH',
            url: '/task/',
            data: task
        });
    }

    $scope.editTask = function (task) {
        task._editing = true;
        //
        $timeout(() => {
            document.getElementById("edit-" + task.id).focus();
        });
    }

    $scope.doneEditing = function (task) {
        delete task._editing;
        $scope.taskChanged(task)
    }
});