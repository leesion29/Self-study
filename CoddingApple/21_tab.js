

$(document).ready(function(){
    //  버튼[0] 클릭 -> 
    $('.tab-button').eq(0).on('click', function(){
        //  모든 버튼과 div의 클래스 네임을 제거
        $('.tab-button').removeClass('orange');
        $('.tab-content').removeClass('show');
        // 0번의 버튼과 div에 클래스 네임 추가
        $('.tab-button').eq(0).addClass('orange');
        $('.tab-content').eq(0).addClass('show');
    });

    $('.tab-button').eq(1).on('click', function(){

        $('.tab-button').removeClass('orange');
        $('.tab-content').removeClass('show');

        $('.tab-button').eq(1).addClass('orange');
        $('.tab-content').eq(1).addClass('show');
    });

    $('.tab-button').eq(2).on('click', function(){

        $('.tab-button').removeClass('orange');
        $('.tab-content').removeClass('show');

        $('.tab-button').eq(2).addClass('orange');
        $('.tab-content').eq(2).addClass('show');
    });
});
