
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(momo, status){
            $('#idEdit').val(momo.id);
            $('#policynumberEdit').val(momo.policynumber);
            $('#telcomNameEdit').val(momo.telcomName);
            $('#mobileNUmberEdit').val(momo.mobileNUmber);
            $('#statusEdit').val(momo.status);
            $('#locationEdit').val(momo.location);
            $('#commentEdit').val(momo.comment);
          
            
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(momo, status){
            $('#idDetails').val(momo.id);
            $('#createdByDetails').val(momo.createdBy);
            $('#createdDateDetails').val(momo.createdDate);
            $('#lastModifiedByDetails').val(momo.lastModifiedBy);
            $('#lastModifiedDateDetails').val(momo.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});