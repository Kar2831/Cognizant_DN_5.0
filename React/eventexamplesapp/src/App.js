import logo from './logo.svg';
import './App.css';
import { Counter } from './components/Counter';
import SyntheticEventDemo from './components/SyntheticEventDemo';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div className="App">
      <Counter/>
      <SyntheticEventDemo/>
      <CurrencyConverter/>
    </div>
  );
}

export default App;
