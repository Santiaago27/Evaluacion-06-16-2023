$(document).ready(function() {
    
    // Consultar datos
    $('#btnConsultar').click(function(event) {
      event.preventDefault();
      $.ajax({
        url: 'http://localhost:8020/listarProductos',
        type: 'GET',
        dataType: 'json',
        success: function(response) {
          mostrarDatosEnTabla(response);
          //$('#resultadosConsulta').html(JSON.stringify(response));
          console.log(typeof response)
        },
        error: function(xhr, status, error) {
          console.log(xhr);
          console.log(status);
          console.log(error);
        }
      });
      return false;
    });
    function mostrarDatosEnTabla(data) {
        var tabla = $('#tablaProductos tbody');
        tabla.empty(); 
    
        data.forEach(function(producto) {
          var fila = $('<tr></tr>');
          fila.append('<td>' + producto.numref + '</td>');
          fila.append('<td>' + producto.nombre + '</td>');
          fila.append('<td>' + producto.categoria + '</td>');
          fila.append('<td>' + producto.preciou + '</td>');
          fila.append('<td>' + producto.cant + '</td>');
          tabla.append(fila);
        });
    
        $('#tablaProductos').show();
      }
//------------------------------------------------------------------------//
    //actualizar10%
$('#btnActualizarPrecios').click(function(event) {
  event.preventDefault();
  $.ajax({
      url: 'http://localhost:8020/actualizarPrecios',
      type: 'POST',
      success: function(response) {
          $('#resultadoActualizacion').text(response);
          console.log(response);
      },
      error: function(xhr, status, error) {
          console.log(xhr);
          console.log(status);
          console.log(error);
      }
  });
  return false;
});

//--------------------------------------------------------------------------//

  
    // Buscar por numref
    $('#buscar').click(function(event) {
      event.preventDefault();
      let numrefCons = $('#buscarP').val();
      $.ajax({
          url: 'http://localhost:8020/buscarProducto/' + numrefCons,
          type: 'GET',
          dataType: 'json',
          success: function(response) {
              mostrarResultadoBusqueda(response);
              console.log(typeof response);
          },
          error: function(xhr, status, error) {
              alert('El número de referencia no existe');
              console.log(xhr);
              console.log(status);
              console.log(error);
          }
      });
      return false;
  });

  function mostrarResultadoBusqueda(data) {
    var tabla = $('#tablaProductos2 tbody');
    tabla.empty(); 
  
    var fila = $('<tr></tr>');
    fila.append('<td>' + data.numref + '</td>');
    fila.append('<td>' + data.nombre + '</td>');
    fila.append('<td>' + data.categoria + '</td>');
    fila.append('<td>' + data.preciou + '</td>');
    fila.append('<td>' + data.cant + '</td>');
    tabla.append(fila);
  
  
    $('#tablaProductos2').show();
  }

})  



