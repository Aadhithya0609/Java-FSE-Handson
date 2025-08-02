import React from 'react';
import ListofPlayers from './ListofPlayers';
import Scorebelow70 from './Scorebelow70';
import ListofIndianPlayers from './ListofIndianPlayers';
import { OddPlayers, EvenPlayers } from './PlayerUtils';

function App() {
  const flag = true;

   const players = [
    { name: 'Virat', score: 88 },
    { name: 'Rohit', score: 145 },
    { name: 'Rahul', score: 72 },
    { name: 'Pant', score: 60 },
    { name: 'Bumrah', score: 30 },
    { name: 'Hardik', score: 75 },
    { name: 'Jadeja', score: 82 },
    { name: 'Ashwin', score: 66 },
    { name: 'Shami', score: 40 },
    { name: 'Surya', score: 95 },
    { name: 'Gill', score: 78 },
  ];

  const IndianTeam = ['Virat', 'Rohit2', 'Rahul3', 'Pant4', 'Bumrah5', 'Hardik6'];
  const T20players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophy = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const IndianPlayers = [...T20players, ...RanjiTrophy];

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Odd Players</h1>
        {OddPlayers(IndianTeam)}
        <h1>Even Players</h1>
        {EvenPlayers(IndianTeam)}
        <hr />
        <h1>List of Indian Players Merged:</h1>
        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;

  const players = [
    { name: 'Virat', score: 88 },
    { name: 'Rohit', score: 145 },
    { name: 'Rahul', score: 72 },
    { name: 'Pant', score: 60 },
    { name: 'Bumrah', score: 30 },
    { name: 'Hardik', score: 75 },
    { name: 'Jadeja', score: 82 },
    { name: 'Ashwin', score: 66 },
    { name: 'Shami', score: 40 },
    { name: 'Surya', score: 95 },
    { name: 'Gill', score: 78 },
  ];

  const IndianTeam = ['Virat', 'Rohit', 'Rahul', 'Pant', 'Bumrah', 'Hardik'];
  