import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 0
    };
  }

  // Method to increment counter
  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  // Method to display hello message
  sayHello = () => {
    alert("Hello! You clicked the increment button.");
  };

  // This function will be called when "Increment" is clicked
  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

  // Decrement counter
  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  // Say welcome with message
  sayWelcome = (message) => {
    alert(`Welcome Message: ${message}`);
  };

  // Synthetic event handler
  handlePress = (event) => {
    alert("I was clicked! (Synthetic Event Triggered)");
    console.log("Synthetic Event Object:", event);
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>React Event Handling Examples</h1>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.handleIncrease}>Increment</button>{' '}
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>Say Welcome</button>
        <br /><br />
        <button onClick={this.handlePress}>Synthetic Event: OnPress</button>
        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
