# MADA — Make A Dream Achievable

MADA is a Java console application designed to help a university student organize and track their academic and professional journey.

## Features

- Student profile
- Course and GPA tracking
- Goals and completion status
- Personal projects
- Skills
- Certificates
- Achievements
- Career plan
- Overall progress engine
- Dashboard
- Save and load using Java serialization
- Input validation
- Separation between model, service, controller, engine, storage, UI, and utility layers

## Technologies

- Java 17+
- Object-Oriented Programming
- Collections
- File I/O
- Serialization
- Exception handling

## Project Structure

```text
MADA/
├── README.md
├── LICENSE
├── .gitignore
└── src/
    ├── app/
    │   └── Main.java
    │
    ├── model/
    │   ├── Student.java
    │   ├── Course.java
    │   ├── Goal.java
    │   ├── Project.java
    │   ├── Skill.java
    │   ├── Certificate.java
    │   ├── Achievement.java
    │   └── CareerPlan.java
    │
    ├── service/
    │   ├── StudentService.java
    │   ├── CourseService.java
    │   ├── GoalService.java
    │   ├── ProjectService.java
    │   └── CareerService.java
    │
    ├── controller/
    │   ├── ApplicationController.java
    │   ├── CourseController.java
    │   ├── GoalController.java
    │   ├── ProjectController.java
    │   ├── SkillController.java
    │   ├── CertificateController.java
    │   ├── AchievementController.java
    │   └── CareerController.java
    │
    ├── engine/
    │   └── ProgressEngine.java
    │
    ├── storage/
    │   └── FileStorage.java
    │
    ├── ui/
    │   └── Dashboard.java
    │
    └── util/
        ├── InputUtil.java
        ├── DateUtil.java
        └── ValidationUtil.java