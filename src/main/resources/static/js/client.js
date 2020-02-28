
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(client, status){
            $('#idEdit').val(client.id);
            $('#policynumberEdit').val(client.policynumber);
            $('#locationEdit').val(client.location);
            $('#departmentEdit').val(client.department);
            $('#requestEdit').val(client.request);
            $('#commentEdit').val(client.comment);
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(client, status){
            $('#idDetails').val(client.id);
            $('#createdByDetails').val(client.createdBy);
            $('#createdDateDetails').val(client.createdDate);
            $('#lastModifiedByDetails').val(client.lastModifiedBy);
            $('#lastModifiedDateDetails').val(client.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});