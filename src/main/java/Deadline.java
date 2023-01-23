/**
 * A type of task with a single deadline.
 */
public class Deadline extends Task {
    // Deadline for the task.
    protected String by;

    /**
     * Constructor for the deadline class.
     *
     * @param description Description of the deadline task.
     * @param by Deadline for the task.
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    /**
     * Overrides the toString method of the Task class.
     *
     * @return String representation of the deadline task.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    /**
     * Overrides the printData method of the Task class.
     *
     * @return String representation of the deadline task in data form.
     */
    @Override
    public String printData() {
        return "D" + "/" + (isDone ? "1" : "0") + "/" + description + "/" + by;
    }
}
