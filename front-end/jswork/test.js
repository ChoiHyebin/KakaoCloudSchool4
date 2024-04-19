function display(param) {
    param();
}

function display2(param) {
    console.log('param: ' + param.url);
}
display2({
    url: 'http',
    user:'aaa',
    pw:'1234'
})

// 함수 표현식 = literal
let sayHi = function() {
    console.log('sayHi..');
};

console.log(sayHi);
sayHi();

let sayGoodbye = function() {
    console.log('sayGoodbye..');
}
display(sayGoodbye);

display(function() {
    
})

function ask(question, yes, no) {
    question = prompt('yes or no : ');
    if(confirm(question)) yes()
    else no();
}

function showOk() {
    alert("동의하셨습니다.");
}

function showCancel() {
    alert("취소 버튼을 누르셨습니다.");
}

// 사용법: 함수 showOk와 showCancel이 ask 함수의 인수로 전달됨
ask("동의하십니까?", showOk, showCancel);