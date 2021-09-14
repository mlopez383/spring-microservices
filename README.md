# Project Statement

Create an e-learning platform with online courses similar to Udemy, Coursera or PluralSight.

![High-level Overview Architecture](https://github.com/mlopez383/spring-boot-practice/blob/develop/misc/MicroserviceArchitecture.png?raw=true)

## Requirements
A web application that allows us to perform the following operations:
Sign Up - Sign In - Sign Out - User Configuration
1.The web application will have the following roles:

**Administrator:** The role is responsible for the platform, with the following functionalities:
- Manage courses (list, add, modify or delete a course).
- The option to "log in as" and choose any user of the system to navigate the platform as if it were the same.
- Send email to a student, students in a course, or an instructor.
- Edit his personal profile.
- Send mass messages to different roles of the platform, such as instructors or students.
- Enter to the forums and modify or delete comments.
- Register and configure courses, and also create and assign lessons and exams to the course.

**Student:** He is able to join a course. He can:
- Start any available course.
- See the progress of his courses.
- Access the course content that the instructor publishes.
- Take the questionnaires that the instructor publishes.
- Access to his certificates of completed courses.
- Modify his personal profile.
- Give a score to a completed course.
- See a report of the courses taken (list courses with the name of the course, start date and end date).
- Participate in a forum of the course you are taking with the instructor and classmates.
- Send messages through the platform.

**Instructor:** It is who will generate the contents of the course. He can:
- Modify his personal profile.
- Access to his dashboard, where he can edit his courses.
- See his received queries by students.
- The course registration will be done through lessons that will be associated with contents, photos, videos, tables, links , etc.
- Answer messages to student inquiries or make inquiries to the administrator, for technical inquiries, etc.
- Register, modify, and delete exam questions.

## Create and publish course
3. The application allows users with the instructor role to create courses. The instructor must enter the following information to create a course:
- Course name.
- Description
- Category
- Price
- Course evaluation (This is not entered by the Instructor, it has to be taken from evaluations made by students).
- Videos: The system must allow the uploading of videos.
- Images: The system must allow the uploading of images.
- Content: The system must allow the uploading of contents.
- Files: The system must allow the uploading of files (PDF, DOC, XML).

4. The course has two states active and inactive. The instructor can activate it. A course in active status is displayed in search results.
5. The instructor can edit a course, delete it as long as it is not active. If you want to modify or delete it, you must first deactivate it.

## Search and view courses
6. Users with the Student role have the possibility to search for courses using different types of filters:
- Course name.
- Category
- Price range

7. The search result should show the courses that match the user's search.

## Promotion Course
8. The system will have a feature called Promotion Course. The promotion consists in that the oldest and active course in the system enters in promotion for possible students. The promotion consists in that the user who accesses to the course first will get a 50% discount. The system must give the user a maximum of 10 minutes to enroll in. If this time passes, the course is released and another student can access it. For this specific feature, you must use concurrent programming. The Promotion Course option can only be activated by the administrator.
