import React, { useState } from 'react'

function CurrencyConverter() {
  
  const[inr, setInr] = useState(0);
  const[euro, setEuro] = useState(null);

    const CONVERSION_RATE = 0.011;

  const handleSubmit = (e) => {
    e.preventDefault();
    const numericInr = parseFloat(inr);

    if(!isNaN(numericInr) && numericInr >= 0){
        const converted = numericInr * CONVERSION_RATE;
        setEuro(converted.toFixed(2));
    } else {
        alert("Please Enter a Valid Amount");
    }
  };
  
    return (
    <div>
        <form onSubmit={handleSubmit}>
            <label htmlFor='inrInput' style={{fontWeight: 'bold'}}>Enter Amount in Rs.</label>
            <input
                id = 'inrInput'
                value = {inr}
                onChange = {(e) => setInr(e.target.value)}
                placeholder='eg.1000'
                required
            />
            <button type='submit'>Submit</button>
        </form>

        {
            euro != null && (
                <div style={{fontWeight: 'bold', color: 'green'}}>
                    <h1>Equivalent Euro <span>{euro}</span></h1>
                </div>
            )
        }

    </div>
  )
}

export default CurrencyConverter