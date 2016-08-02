package com.vstechlab.mvp.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Define callback for getter of data. Also consider adding callback
 * to other method to inform the user of network/database error or successful
 * operations.
 */
public interface TasksDataSource {

    interface GetTaskCallback {

        void onTaskLoaded(Task task);

        void onDataNotAvailable();
    }

    @Nullable
    List<Task> getTasks();

    @Nullable
    Task getTask(@NonNull String taskId);

    void saveTask(@NonNull Task task);

    void completeTask(@NonNull Task task);

    void completeTask(@NonNull String taskId);

    void activateTask(@NonNull Task task);

    void activateTask(@NonNull String taskId);

    void clearCompletedTasks();

    void refreshTasks();

    void deleteAllTasks();

    void deleteTask(@NonNull String taskId);

}
