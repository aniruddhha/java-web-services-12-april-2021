function callWs() {
    console.log('Clicked')

    getData()
}

function getData() {
    const client = new XMLHttpRequest();
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log(this.responseText)
      }
    };
    client.open("GET", "http://localhost:8080/balance", true);
    client.setRequestHeader("Authorization", "Basic " + btoa("admin:pass123"));
    client.send();
}