package Task_Management_System;

public class TaskManagementDemo {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task(1, "Complete report", "Pending");
        Task task2 = new Task(2, "Attend meeting", "Completed");
        Task task3 = new Task(3, "Submit invoice", "In Progress");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("Traverse Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch for Task with ID 2:");
        Task foundTask = taskList.searchTask(2);
        System.out.println(foundTask != null ? foundTask : "Task not found");

        System.out.println("\nDelete Task with ID 2:");
        boolean isDeleted = taskList.deleteTask(2);
        System.out.println(isDeleted ? "Task deleted" : "Task not found");

        System.out.println("\nTraverse Tasks after deletion:");
        taskList.traverseTasks();
    }
}
