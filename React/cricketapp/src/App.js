import logo from './logo.svg';
import './App.css';
import { ListOfPlayers, ScoreBelow70 } from './components/ListOfPlayers';
import { OddPlayers, EvenPlayers } from './components/IndianPlayers';

function App() {
  return (
    <div>
      <h1>List of Players</h1>
      <ListOfPlayers/>
      <h1>Score Below 70</h1>
      <ScoreBelow70/>
      <h1>Odd Players</h1>
      <OddPlayers/>
      <h1>Even Players</h1>
      <EvenPlayers/>
    </div>
  );
}

export default App;
