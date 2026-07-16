import React from "react";

function OfficeSpace(){

    const url = "https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg";
    const jsximg = <img src={url} height = "25%" width = "25%"/>
    const itemName = {
        name: "DBS",
        rent: 50000,
        address: "Chennai"
    };
    const element = "Office Space";
    return(
        <div>
            <h1>{element}, At Affordable Price</h1>
            {jsximg}
            <h1>Name: <span>{itemName.name}</span></h1>
            <h2>Color: <span style = {{color: itemName.rent <= 60000 ? 'red' : 'green'}}>{itemName.rent}</span></h2>
            <h2>Address: <span>{itemName.address}</span></h2>
        </div>
    );
}

export default OfficeSpace;