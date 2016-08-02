package com.vstechlab.mvp.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Concrete implementation to load tasks from the datasource into a cache.
 */
public class TasksRepository implements TasksDataSource {
    @Nullable
    @Override
    public List<Task> getTasks() {
        return null;
    }

    @Nullable
    @Override
    public Task getTask(@NonNull String taskId) {
        return null;
    }

    @Override
    public void saveTask(@NonNull Task task) {

    }

    @Override
    public void completeTask(@NonNull Task task) {

    }

    @Override
    public void completeTask(@NonNull String taskId) {

    }

    @Override
    public void activateTask(@NonNull Task task) {

    }

    @Override
    public void activateTask(@NonNull String taskId) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void deleteTask(@NonNull String taskId) {

    }

    public interface TaskRepositoryObserver {
        void onTaskChanged();
    }
}
