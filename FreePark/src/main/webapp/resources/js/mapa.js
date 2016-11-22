var map;
$(document).ready(function(){
  map = new GMaps({
    div: '#map',
    lat: -34.624174,
    lng:-68.329930
  
  });
  
  GMaps.geolocate({
	  success: function(position) {
	    map.setCenter(position.coords.latitude, position.coords.longitude);
	    map.addMarker({
            lat: position.coords.latitude,
            lng: position.coords.longitude,
            infoWindow: {
            	content: "Aca estamos"
            }
        });
	  },
	  error: function(error) {
	    alert('Geolocation failed: '+error.message);
	  },
	  not_supported: function() {
	    alert("Your browser does not support geolocation");
	  },
	  always: function() {
	  
	  }
	});
  
  $.each(a, function(key, playa){
	  
	  map.addMarker({
		  lat: playa.latitud,
		  lng: playa.longitud,
		  infoWindow: {
			  content: playa.nombre
		  },
		  click: function(e) {
			  window.location =  playa.id + '/infoplaya';
			  },
		  mouseover: function(e) {
			  this.infoWindow.open(map, this)
				  },
		  mouseout: function(){
			  this.infoWindow.close()
		  }
	
		});
	 
	})
  
});


