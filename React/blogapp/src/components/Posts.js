import React, { Component } from "react";

class Posts extends Component{
    constructor(props){
        super(props);
        this.state = {
            posts: [],
            hasError: false,
            errorMessage: ''
        };
    }
    loadPosts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then((response) => {
                if(!response.ok){
                    console.log("Network response was not stable");
                }
                return response.json();
            })
            .then((data) => {
                this.setState({posts: data.slice(0, 10)});
            })
            .catch((error) => {
                console.error("Fetch error: ", error);
                this.setState({hasError: true, errorMessage: error.message});
            });
    }
    componentDidMount(){
        console.log("Component successfully mounted to DOM. Triggering API call...");
        this.loadPosts();   
    }
    componentDidCatch(error, info){
        console.error("Component Did Catch captured an anomaly: ", error, info);
        this.setState({hasError: true, errorMessage: error.toString()});
        alert(`An error occured within the Posts component: ${error.message}`);
    }
    render(){
        if(this.state.hasError){
            return(
                <div style = {{textAlign: 'center', color: 'red', marginTop: '20px'}}>
                    <h2>Something went wrong loading the posts.</h2>
                    <p>{this.state.errorMessage}</p>
                </div>
            );
        }
        return(
            <div style={{padding: '20px', fontFamily: 'Arial, sans-serif'}}>
                <h1 style={{textAlign: 'center', color: '#333'}}>Blog Posts</h1>
                <hr/>

                {this.state.posts.length === 0 ? (
                    <p style = {{textAlign: 'center'}}>Loading items from database...</p>
                ) : (
                    this.state.posts.map((post) => (
                        <div 
                            key = {post.id}
                            style={{
                                backgroundColor: '#f9f9f9',
                                border: '1px solid #ddd',
                                borderRadius: '5px',
                                padding: '15px',
                                margin: '15px auto',
                                maxWidth: '600px',
                                boxShadow: '0 2px 4px rgba(0,0,0,0.05)'
                            }}
                        >
                            <h3 style={{color: 'brown', textTransform: 'capitalize'}}>
                                {post.id}. {post.title}
                            </h3>
                            <p style={{color: '#555', lineHeight: '1.6'}}>
                                {post.body}
                            </p>
                        </div>
                    ))
                )}
            </div>
        );
    }
}

export default Posts;