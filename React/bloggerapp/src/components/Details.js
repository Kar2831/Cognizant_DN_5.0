import React from 'react'
import CourseDetails from './CourseDetails'
import BookDetails from './BookDetails'
import BlogDetails from './BlogDetails'

function Details() {

    const books = [
        {title: 'Master React', pages: 670},
        {title: 'Deep Dive into Angular 11', pages: 800},
        {title: 'Mongo Essentials', pages: 450},
    ]

    const blogs = [
        {name: 'Master React', author: 'Stephen Biz', description: 'Welcome to Learning React'},
        {name: 'Deep Dive into Angular 11', author: 'Schewzde', description: 'You can install React from npm'},
    ]

    const courses = [
        {title: 'Angular', date: '4/5/2021'},
        {title: 'React', date: '6/3/2021'},
    ]

  return (
    <div style={{display: 'flex', gap: '50px'}}>
        <CourseDetails courses = {courses} />
        <BookDetails books = {books} />
        <BlogDetails blogs = {blogs} />
    </div>
  )
}

export default Details