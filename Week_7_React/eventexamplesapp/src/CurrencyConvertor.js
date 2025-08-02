import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: '',
      euro: ''
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const euroRate = 0.011; // Example conversion rate
    const converted = (this.state.rupees * euroRate).toFixed(2);
    this.setState({ euro: converted });
  };

  render() {
    return (
      <div style={{ marginTop: '30px' }}>
        <h2>Currency Convertor (INR to Euro)</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Enter amount in ₹:
            <input
              type="number"
              value={this.state.rupees}
              onChange={this.handleChange}
              required
            />
          </label>
          <button type="submit">Convert</button>
        </form>
        {this.state.euro && (
          <h3>Converted: € {this.state.euro}</h3>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
