import React, {useState} from "react";

export function Counter(){

    const[count, setCount] = useState(0);

    const sayHello = () => {
        console.log(`Hello Button Clicked`);
        alert(`Hello`);
    }

    const incrementValue = () => {
        setCount(prev => prev + 1);
    }

    const handleIncrement = () => {
        incrementValue();
        sayHello();
    }

    return(
        <div>
            <h1>{count}</h1>
            <button onClick = {handleIncrement}>Increment</button>
            <button onClick = {() => setCount(prev => prev - 1)}>Decrement</button>
            <button onClick = {sayHello}>Say Hello</button>

        </div>
    );

}