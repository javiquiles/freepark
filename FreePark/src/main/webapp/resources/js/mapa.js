var map;
$(document).ready(function(){
  map = new GMaps({
    div: '#map',
    lat: latitud,
    lng: longitud
  });
  
  map.addMarker({
            lat: map.getCenter().lat(),
            lng: map.getCenter().lng(),
            draggable: true,
            dragend: function (e, d) {
				$('#latitud').val(e.latLng.lat());
				$('#longitud').val(e.latLng.lng());
            }
        });
});
