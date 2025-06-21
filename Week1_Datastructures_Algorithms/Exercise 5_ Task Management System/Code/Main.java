public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("All Tasks:");
        manager.displayTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task t = manager.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        manager.deleteTask(2);

        System.out.println("\nAll Tasks after deletion:");
        manager.displayTasks();
    }
}
