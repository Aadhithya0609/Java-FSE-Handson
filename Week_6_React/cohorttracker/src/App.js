import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      name: "React Beginners",
      batch: "Batch A",
      status: "ongoing",
      startDate: "2025-07-01",
      endDate: "2025-08-15",
    },
    {
      name: "Advanced Java",
      batch: "Batch B",
      status: "completed",
      startDate: "2025-06-01",
      endDate: "2025-07-15",
    },
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>MyAcademy Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
