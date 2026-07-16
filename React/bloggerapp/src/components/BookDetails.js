import React from 'react'

function BookDetails(props) {
  return (
    <div>
        {
            props.books.map((book, index) => (
                <div key={index}>
                    <h1>Book: {book.title}</h1>
                    <h1>Pages: {book.pages}</h1>
                </div>
            ))
        }
    </div>
  )
}

export default BookDetails