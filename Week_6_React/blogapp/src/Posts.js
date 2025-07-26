import React, { Component } from "react";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  loadPosts() {
    const pantPost = {
      id: 999,
      title: "Rishabh Pant Fractures Toe in England Test Match",
      body: `Rishabh Pant suffered a fractured toe after being hit by a delivery from Chris Woakes
during the 4th Test at Old Trafford. Despite medical advice, he returned to bat in pain and 
received a standing ovation. He is expected to rest for 6 weeks, missing the rest of the series. 
India may bring in Ishan Kishan as the replacement wicketkeeper.`,
    };

    const englishPosts = [
      {
        id: 1,
        title: "Top 5 Fitness Tips for Beginners",
        body: "Start with simple exercises, stay consistent, eat well, rest enough, and stay hydrated.",
      },
      {
        id: 2,
        title: "The Future of AI in Healthcare",
        body: "Artificial Intelligence is revolutionizing diagnosis, treatment plans, and patient monitoring.",
      },
      {
        id: 3,
        title: "Traveling Alone: Why You Should Try It",
        body: "Solo travel helps you discover yourself, boosts confidence, and offers ultimate freedom.",
      },
      {
        id: 4,
        title: "How to Start Coding in 2025",
        body: "Begin with HTML, CSS, and JavaScript. Then explore Python and Git for projects.",
      },
      {
        id: 5,
        title: "Easy Indian Meals for College Students",
        body: "Try simple recipes like upma, poha, maggi, and quick paneer bhurji using basic ingredients.",
      },
    ];

    this.setState({ posts: [pantPost, ...englishPosts] });
  }

  componentDidCatch(error, info) {
    alert("An error occurred while rendering the component.");
    console.error(error, info);
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Something went wrong. Please try again later.</h2>;
    }

    return (
      <div style={{ padding: "20px" }}>
        <h1>Welcome to BlogApp</h1>
        <h2>Posts</h2>
        {posts.map((post) => (
          <div key={post.id} style={{ marginBottom: "20px" }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
