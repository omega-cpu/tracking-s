
$('document').ready(function(){
    $('.table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(aname, status){
            $('#idEdit').val(aname.id);
            $('#policyNumberEdit').val(aname.policyNumber);
            $('#oldNameEdit').val(aname.oldName);
            $('#newNameEdit').val(aname.newName);
            $('#locationEdit').val(aname.location);
            $('#statusEdit').val(aname.status);
            $('#commentEdit').val(aname.comment);
           
        });

        $('#editModal').modal();

    });

    $('.table #detailsButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(aname, status){
            $('#idDetails').val(aname.id);
            $('#policyNumberDetails').val(aname.policyNumber);
            $('#createdByDetails').val(aname.createdBy);
            $('#createdDateDetails').val(aname.createdDate);
            $('#lastModifiedByDetails').val(aname.lastModifiedBy);
            $('#lastModifiedDateDetails').val(aname.lastModifiedDate);
          
           
        });

        $('#detailsModal').modal();

    });


});