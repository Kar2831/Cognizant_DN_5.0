import React from 'react';

const players = [
    {name: "ABC", score: 90},
    {name: "BCD", score: 70},
    {name: "CDE", score: 90},
    {name: "DEF", score: 80},
    {name: "EFG", score: 30},
    {name: "GHI", score: 50},
    {name: "HIJ", score: 40},
    {name: "IJK", score: 20},
    {name: "JKL", score: 10},
]

export function ListOfPlayers(){
    return(
        <div>
            {
                players.map((item, index) => (
                    <div key={index}>
                        <ul>
                            <li>Mr. {item.name} <span>{item.score}</span></li>
                        </ul>
                    </div>
                ))
            }
        </div>
    );
}

export function ScoreBelow70(){

    const player70 = players.filter((item) => item.score <= 70);
    console.log(player70);
    return(
        <div>
            {
                player70.map((item, index)=> {
                    return(<div key={index}>
                        <ul>
                            <li>Mr. {item.name} - <span>{item.score}</span></li>
                        </ul>
                    </div>);
                })
            }
        </div>
    );
}