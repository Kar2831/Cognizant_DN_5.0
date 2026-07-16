import React from 'react'

function BlogDetails(props) {
  return (
    <div>
        {
            props.blogs.map((blog, index) => (
                <div>
                    <h1>Blog: {blog.name}</h1>
                    <h1>Author: {blog.author}</h1>
                    <h2>Description: {blog.description}</h2>
                </div>
            ))
        }
    </div>
  )
}

export default BlogDetails