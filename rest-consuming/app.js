function callWs() {
    console.log('Clicked')

    getData()
}

function getData() {
    const client = new XMLHttpRequest(); // http client
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log('Server Response - '+this.responseText)
      }
    };
    client.open("GET", "http://localhost:8080/balance", true); // method, url , async
//    client.setRequestHeader("Authorization", "Basic " + btoa("admin:pass123")); // user and password in base64
    client.send();
}