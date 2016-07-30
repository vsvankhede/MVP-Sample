package com.vstechlab.mvp.tasks;

import android.support.annotation.NonNull;

import com.vstechlab.mvp.BasePresenter;
import com.vstechlab.mvp.BaseView;
import com.vstechlab.mvp.data.Task;

import java.util.List;

public interface TasksContract {
    /**
     * Concern only things which needs tobe shown on screen.
     */
    interface View extends BaseView<Presenter> {
        void showLoadingIndicator(boolean active);

        void showTasks(List<Task> tasks);

        void showAddTask();

        void showTaskDetailUi(String taskId);

        void showTaskMarkedComplete();

        void showTaskMarkedActive();

        void showCompletedTasksCleared();

        void showLoadingTasksError();

        void showNoTasks();

        void showActiveFilterLabel();

        void showCompletedFilterLabel();

        void showAllFilterLabel();

        void showNoActiveTasks();

        void showNoCompletedTasks();

        void showSuccessfullySavedMessage();

        boolean isActive();

        void showFilteringPopUpMenu();
    }

    /**
     * Concern only about user action.
     */
    interface Presenter extends BasePresenter {
        void result(int requestCode, int resultCode);

        void loadTasks(boolean forceUpdate);

        void addNewTask();

        void openTaskDetails(@NonNull Task requestedTask);

        void completeTask(@NonNull Task completedTask);

        void activateTask(@NonNull Task activeTask);

        void clearCompletedTasks();

        void setFiltering(TasksFilterType requestType);

        TasksFilterType getFiltering();

    }
}
