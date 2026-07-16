import React from 'react'

function CourseDetails(props) {
  return (
    <div>
        {
            props.courses.map((course, index) => (
                <div key={index}>
                    <h1>Course: {course.title}</h1>
                    <h1>date: {course.date}</h1>
                </div>
            ))
        }
    </div>
  )
}

export default CourseDetails