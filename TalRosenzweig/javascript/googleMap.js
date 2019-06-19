
      function initMap() {
        var uluru = {lat: 32.0559833, lng: 34.8544064};
        var map = new google.maps.Map(document.getElementById('myMap'), {
          zoom: 14,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
