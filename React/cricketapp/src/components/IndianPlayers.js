import React from "react";

const IndianTeam = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvraj5", "Raina6"];

export function OddPlayers(){
    const [first, ,third, ,fifth] = IndianTeam;

    return(
        <div>
            <ul>
                <li>First: {first}</li>
                <li>Third: {third}</li>
                <li>Fifth: {fifth}</li>
            </ul>
        </div>
    )
}

export function EvenPlayers(){
    const [, second, , fourth, , sixth] = IndianTeam;

    return(
        <div>
            <ul>
                <li>Second: {second}</li>
                <li>Fourth: {fourth}</li>
                <li>Sixth: {sixth}</li>
            </ul>
        </div>
    );
}