import React from 'react';

const blogs = [
  { id: 1, title: "React Learning", author: "Stephen" },
  { id: 2, title: "Installation", author: "Schneider" }
];

function BlogList() {
  return (
    <ul>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
        </div>
      ))}
    </ul>
  );
}

export default BlogList;
