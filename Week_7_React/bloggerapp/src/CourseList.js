import React from 'react';

const courses = [
  { id: 1, name: "Angular", date: "4/1/2021" },
  { id: 2, name: "React", date: "6/1/2021" }
];

function CourseList() {
  return (
    <ul>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );
}

export default CourseList;
