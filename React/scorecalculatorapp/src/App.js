import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './components/CalculateScore';

function App() {
  console.log("App.js")
  return (
    <div className="App">
      <CalculateScore
        Name = "Karthikeyan"
        School = "St.John's M.H.S.S"
        total = {284}
        goal = {3}
      />
    </div>
  );
}

export default App;
