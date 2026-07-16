import React from 'react'

export function UserGreeting(){
    return <h1>Welcome Back</h1>
}

export function GuestGreeting(){
    return <h1>Please Sign Up</h1>
}

export function Greeting(props){
    if(props.isLoggedIn){
        <UserGreeting/>
    }else{
        <GuestGreeting/>
    }
}

export function LoginButton(props){
    return(
        <button onClick = {props.onClick}>
            Login
        </button>
    );
}

export function LogoutButton(props){
    return(
        <button onClick = {props.onClick}>
            LogoutButton
        </button>
    );
}

export function FlightDetails(){
    return(
        <div style={{marginTop: '20px', border: '1px solid black', padding: '15px'}}>
            <h3>Available Flights</h3>
            <ul>
                <li>Flight AI-101: New York to London - 10:00 AM</li>
                <li>Flight BA-202: Paris to Tokyo - 04:30 PM</li>
            </ul>
        </div>
    );
}

export function TicketBookingPanel(props){

    if(!props.isLoggedIn){
        return null;
    }

    return(
        <div style={{marginTop: '20px', backgroundColor: '#e6f7ff', padding: '15px', borderRadius: '5px'}}>
            <h3>Available Flights</h3>
            <p>Logged in authorization verified. You can now book tickets.</p>
            <button onClick={() => alert('Ticket Booked Successfully')}>Book Ticket now</button>
        </div>
    );
}
