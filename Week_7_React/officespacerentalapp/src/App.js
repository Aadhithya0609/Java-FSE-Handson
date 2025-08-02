import React from 'react';

function App() {
  // JSX heading
  const heading = "Office Space Rental App";

  // Image JSX attribute
  const imageSrc = "https://d14ooopotgqw8y.cloudfront.net/uploads/4_d959633da2.webp";
const jsxImage = <img src={imageSrc} width="25%" height="25%" alt="Office Space" />;


  // List of office space objects
  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "WeWork", Rent: 80000, Address: "Bangalore" },
    { Name: "SmartWorks", Rent: 60000, Address: "Hyderabad" },
    { Name: "Awfis", Rent: 45000, Address: "Mumbai" }
  ];

  // Inline CSS condition
  const getRentStyle = (rent) => {
    return {
      color: rent <= 60000 ? 'red' : 'green'
    };
  };

  return (
    <div style={{ padding: '20px' }}>
      {/* JSX Heading */}
      <h1>{heading}</h1>

      {/* JSX Image */}
      {jsxImage}

      <h2 style={{ marginTop: '20px' }}>Available Office Spaces</h2>

      {/* Loop through office list */}
      {officeList.map((office, index) => (
        <div key={index} style={{ marginBottom: '15px' }}>
          <h3>Name: {office.Name}</h3>
          <h4 style={getRentStyle(office.Rent)}>Rent: Rs. {office.Rent}</h4>
          <h4>Address: {office.Address}</h4>
        </div>
      ))}
    </div>
  );
}

export default App;
