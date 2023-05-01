package com.kelompok5.finpro5todolist.task_database;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.kelompok5.todolist.db";
    public static final int DB_VERSION = 1;

    public static class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}