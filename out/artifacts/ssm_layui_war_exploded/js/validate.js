const verify = {
    experience: (item, value) => {
        if (!numberValidation(value)) {
            layer.msg(item + '(经验)必须是数字且不大于8位', {title: '格式错误', icon: 5})
            return false;
        }
        return true;
    },
    logins: (item, value) => {
        if (!numberValidation(value)) {
            layer.msg(item + '(登录数)必须是数字且不大于8位', {title: '格式错误', icon: 5})
            return false;
        }
        return true;
    },
    wealth: (item, value) => {
        if (!numberValidation(value)) {
            layer.msg(item + '(财富)必须是数字且不大于8位', {title: '格式错误', icon: 5})
            return false;
        }
        return true;
    },
    score: (item, value) => {
        if (!(numberValidation(value) || sizeValidation(value))) {
            layer.msg(item + '(分数)必须是数字且最高为100', {title: '格式错误', icon: 5})
            return false;
        }
        return true;
    }

}

const numberValidation = (value) => {
    let regExp = /^[0-9]{1,8}$/;
    console.log(regExp.test(value))
    return regExp.test(value);
}

const sizeValidation = (value) => {
    let regExp = /^\d+?$|100$|0$/;
    return regExp.test(value);
}

const validation = ({experience, logins, wealth, score}) => {
    let obj = {experience, logins, wealth, score};
    for (let x in obj) {
        if (!verify[x](x, obj[x])) {
            return false;
        }
    }
    return true;
}