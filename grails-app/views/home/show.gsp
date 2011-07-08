<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <p>XML Query Results: ${xmlMap.query}</p>
        <ul>
            <li>Latitude: ${xmlMap.lat}</li>
            <li>Longitude: ${xmlMap.lng}</li>
            <li>Address: ${xmlMap.address}</li>
        </ul>
        
        <p>JSON Query Results: ${jsonMap.query}</p>
        <ul>
            <li>Latitude: ${jsonMap.lat}</li>
            <li>Longitude: ${jsonMap.lng}</li>
            <li>Address: ${jsonMap.address}</li>
        </ul>    
    </body>
</html>