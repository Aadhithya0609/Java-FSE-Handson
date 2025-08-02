import React from 'react';

const positions = ["First", "Second", "Third", "Fourth", "Fifth", "Sixth"];

export const OddPlayers = (team) => {
  const odd = team.filter((_, index) => index % 2 === 0);
  return (
    <ul>
      {odd.map((player, index) => (
        <li key={index}>{positions[index]}: {player}</li>
      ))}
    </ul>
  );
};

export const EvenPlayers = (team) => {
  const even = team.filter((_, index) => index % 2 !== 0);
  return (
    <ul>
      {even.map((player, index) => (
        <li key={index}>{positions[index + 1]}: {player}</li>
      ))}
    </ul>
  );
};
