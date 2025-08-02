import React from 'react';
import { books } from './data';
import BookList from './BookList';
import CourseList from './CourseList';
import BlogList from './BlogList';

function App() {
  return (
    <div style={{ display: 'flex', justifyContent: 'space-around' }}>
      <div className="mystyle">
        <h1>Course Details</h1>
        <CourseList />
      </div>

      <div>
        <h1>Book Details</h1>
        <BookList books={books} />
      </div>

      <div className="mystyle">
        <h1>Blog Details</h1>
        <BlogList />
      </div>
    </div>
  );
}

export default App;
