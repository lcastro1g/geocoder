<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <p>Results for XML Query: ${xmlMap.query}</p>
        <ul>
            <li>Latitude: ${xmlMap.lat}</li>
            <li>Longitude: ${xmlMap.lng}</li>
            <li>Address: ${xmlMap.address}</li>
        </ul>
        
        <p>Results for JSON Query: ${jsonMap.query}</p>
        <ul>
            <li>Latitude: ${jsonMap.lat}</li>
            <li>Longitude: ${jsonMap.lng}</li>
            <li>Address: ${jsonMap.address}</li>
        </ul>    
    </body>
</html>