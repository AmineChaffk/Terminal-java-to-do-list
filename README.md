📝 To-Do List Console App (Java)
💡 Description

This is a simple Java console-based To-Do List application that allows users to add, view, and remove tasks interactively.
The project was really fun to build — it helped me practice ArrayList, loops, methods, and user input with Scanner in Java.
It’s small, but it shows how logic and structure can make even a basic project feel useful and organized.

⚙️ Features

✅ Add new tasks easily
✅ View all existing tasks
✅ Remove any task by its number
✅ Prevents actions when the list is empty
✅ Runs in a simple console interface

🧠 What I Learned

How to use ArrayList to store dynamic data

How to handle user input using Scanner

How to organize code into functions (methods)

Basic loop control (while, if/else)

Improving code structure and readability

💻 Code Overview
// Example core methods
static void add(ArrayList<String> list, Scanner sc) { ... }
static void view(ArrayList<String> list) { ... }
static void remove(ArrayList<String> list, Scanner sc) { ... }


add() → asks the user for a new task and adds it to the list

view() → prints all tasks with their index numbers

remove() → removes a task by its number after confirming it exists

main() → handles menu display and user choices

🚀 How to Run

Clone this repository

Open the project in any Java IDE (e.g., IntelliJ, VS Code, Eclipse)

Run the Main.java file

Follow the on-screen instructions

🎨 Example Output
1 --- Add task
2 --- View task
3 --- Remove task + View task
4 --- Exit

Enter choice: 1
Enter task name:
Learn Java
✅ Task added successfully!

💬 Final Note

This was a fun project that helped me improve my Java logic and console interaction skills.
I plan to add more features soon — like saving tasks to a file and using colors (ANSI) for a better UI.
