import React from 'react'

function SyntheticEventDemo() {

    const handlePress = (e) => {
        console.log("React Synthetic Event:", e.type);
        alert("I was clicked");
    }

  return (
    <div>
        <h2>Synthetic Event Example</h2>
        <button onClick={handlePress}>
            OnPress (Click Me)
        </button>
    </div>
  )
}

export default SyntheticEventDemo;