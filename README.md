# Calendar GUI Application

This is a simple calendar application developed in Java using Swing for the graphical user interface (GUI). The application allows users to manage events only for the month of July 2024. Users can add, view, shift, delete, and manage multiple events on specific days, ensuring that events on the same day have unique start times.

## Features

- **Add Events**: Users can create and schedule events for any day in July 2024.
- **View Events**: Users can view all events scheduled for any specific day.
- **Shift Events**: Events can be moved from one time slot to another within the same day or across different days.
- **Delete Events**: Users can delete events from any day.
- **Event Validation**: Each event's start time is validated to ensure no two events overlap on the same day.
- **Persistent Data**: The event data is persisted across sessions (can be implemented using MySQL or SQLite).

## Project Structure

- `Events`: A class that holds the attributes of an event (title, start hour, start minute, end minute, and isBooked flag).
- `Days`: A class that holds a list of events for a given day.
- `Month`: A class that holds a map of days with date strings as keys, representing the days of July 2024.

## How to Run the Project

1. Clone this repository:
    ```bash
    git clone https://github.com/DulinaS/CalanderGUI.git
    ```

2. Open the project in NetBeans or your preferred Java IDE.

3. Ensure the necessary dependencies (such as a MySQL or SQLite driver if you are using a database) are included.

4. Build and run the project.

## Database Setup (Optional)

If you want to persist events using a database, follow these steps:

1. Install MySQL or SQLite.
2. Create a database and an events table with columns like `id`, `title`, `start_hour`, `start_minute`, `end_minute`, and `date`.
3. Update the database connection details in the project.

## Dependencies

- **JDK 17** or higher
- NetBeans 22 (or any compatible IDE)
- MySQL or SQLite (optional, for data persistence)

## Future Enhancements

- Add support for multiple months and years.
- Implement a search functionality to find events quickly.
- Improve the event management system by allowing updates and notifications for upcoming events.

