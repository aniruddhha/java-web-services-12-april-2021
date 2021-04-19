function getData() {
    const client = new XMLHttpRequest(); // http client
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log('Server Response - '+this.responseText)
      }
    };
    client.open("GET", "http://localhost:8080/balance", true); // method, url , async
    client.send();
}

function postData() {
    const client = new XMLHttpRequest(); // http client
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log('Server Response - '+this.responseText)
      }
    };
    client.open("POST", "http://localhost:8080/deposit/65987", true); // method, url , async
    client.send();
}

function deleteData() {
    const client = new XMLHttpRequest(); // http client
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log('Server Response - '+this.responseText)
      }
    };
    client.open("DELETE", "http://localhost:8080/withdraw/10", true); // method, url , async
    client.send();
}

function putData() {
    const client = new XMLHttpRequest(); // http client
    client.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        console.log('Server Response - '+this.responseText)
      }
    };
    client.open("PUT", "http://localhost:8080/penalty", true); // method, url , async
    client.send();
}