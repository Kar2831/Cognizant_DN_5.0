import React, { useState } from 'react'
import { Greeting, LoginButton, LogoutButton, FlightDetails, TicketBookingPanel } from './BookingComponents';

function BookingApp() {

    const[isLoggedIn, setIsLoggedIn] = useState(false);

    const handleLoginClick = () => {
        setIsLoggedIn(true);
    }

    const handleLogoutClick = () => {
        setIsLoggedIn(false);
    }

    let authButton;
    
    if(isLoggedIn){
        authButton = <LogoutButton onClick = {handleLogoutClick} />
    }else{
        authButton = <LoginButton onClick = {handleLoginClick} />
    }

  return (
    <div>
        <Greeting isLoggedIn = {isLoggedIn} />

        <div style={{margin: '15px 0'}}>
            {authButton}
        </div>

        <FlightDetails/>

        <TicketBookingPanel isLoggedIn = {isLoggedIn} />

    </div>
  )
}

export default BookingApp;