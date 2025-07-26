import React from 'react';
import '../stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Praveen";
  const school = "Sunshine High School";
  const total = 480;
  const goal = 600;
  const average = (total / goal) * 100;

  return (
    <div className="container">
      <h2>Student Score Summary</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
